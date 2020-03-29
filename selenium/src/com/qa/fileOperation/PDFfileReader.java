package com.qa.fileOperation;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

import com.qa.base.DynamicBaseClass;

public class PDFfileReader extends DynamicBaseClass {

	@Test(enabled = true, priority = 1)
	public void readPDFfile() throws IOException, MalformedURLException {
		URL url = new URL("file:///C:/Users/DELL%20PC/git/projects/selenium/Test%20Data/sample.pdf");
		InputStream inputStream = url.openStream();
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
		PDDocument pdDocument = PDDocument.load(bufferedInputStream);
		String pdfContent = new PDFTextStripper().getText(pdDocument);
		System.out.println(pdfContent);

	}

	@Test(enabled = false, priority = 2)
	public void readPDFPageWise() throws IOException, MalformedURLException {
		DynamicBaseClass.NavigateToUrl("http://www.africau.edu/images/default/sample.pdf");
		String currentUrl= driver.getCurrentUrl();
		URL url = new URL(currentUrl);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
		PDDocument pdDocument = PDDocument.load(bufferedInputStream);
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		pdfTextStripper.setStartPage(1);
		pdfTextStripper.setEndPage(1);
		System.out.println("******************************");
		System.out.println(pdfTextStripper.getText(pdDocument));
	}

	@Test(enabled = false, priority = 3)
	public void readPDFfileByParsing() throws IOException, MalformedURLException {
		URL url = null;
		BufferedInputStream bufferedInputStream = null;
		PDFTextStripper pdfStripper = null;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;
		PDFParser pdfParser = null;
		String PDFparsedText = null;

		url = new URL("http://www.africau.edu/images/default/sample.pdf");
		bufferedInputStream = new BufferedInputStream(url.openStream());

		/*
		 * java.lang.ClassCastException: class java.io.BufferedInputStream cannot be
		 * cast to class org.apache.pdfbox.io.RandomAccessRead
		 */
		pdfParser = new PDFParser((RandomAccessRead) bufferedInputStream);
		pdfParser.parse();
		cosDoc = pdfParser.getDocument();
		pdfStripper = new PDFTextStripper();
		pdfStripper.setStartPage(1);
		pdfStripper.setEndPage(1);

		pdDoc = new PDDocument(cosDoc);
		PDFparsedText = pdfStripper.getText(pdDoc);
		System.out.println("******************************");
		System.out.println(PDFparsedText);
	}
}

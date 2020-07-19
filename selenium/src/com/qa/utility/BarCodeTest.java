/*
 * package com.qa.utility;
 * 
 * import java.awt.image.BufferedImage; import java.io.IOException; import
 * java.net.MalformedURLException; import java.net.URL;
 * 
 * import javax.imageio.ImageIO;
 * 
 * import org.openqa.selenium.By; import org.testng.annotations.Test;
 * 
 * import com.google.zxing.BinaryBitmap; import
 * com.google.zxing.LuminanceSource; import com.google.zxing.MultiFormatReader;
 * import com.google.zxing.NotFoundException; import com.google.zxing.Result;
 * import com.google.zxing.common.HybridBinarizer; import
 * com.qa.base.DynamicBaseClass;
 * 
 * public class BarCodeTest extends DynamicBaseClass {
 * 
 * @Test public void barCodeTest() throws IOException, MalformedURLException,
 * NotFoundException {
 * DynamicBaseClass.NavigateToUrl("https://barcode.tec-it.com/en");
 * 
 * String barCodeUrl =
 * driver.findElement(By.tagName("img")).getAttribute("src");
 * System.out.println(barCodeUrl);
 * 
 * URL url = new URL(barCodeUrl); BufferedImage bufferedImage =
 * ImageIO.read(url);
 * 
 * LuminanceSource luminanceSource= new
 * BufferedImageLuminanceSource(bufferedImage); BinaryBitmap binaryBitmap= new
 * BinaryBitmap(new HybridBinarizer(luminanceSource)) ; Result result= new
 * MultiFormatReader().decode(binaryBitmap);
 * System.out.println("Barcode Text"+result.getText());
 * 
 * System.out.println("BarcodeFormat "+result.getBarcodeFormat());
 * System.out.println("Bar Timestamp"+result.getTimestamp());
 * 
 * } }
 */
package com.java.objectClassMethods;

/*To read the value of your class
attributes. For that, you need to override toString().*/

public class OverriedingtoStringMethod {

}

/*
 * The default toString() method outputs a string formed from:
 * getClass().getName() + '@' + Integer.toHexString(hashCode()). That is not
 * useful 99.8% of the time. Usually, you want to read the value of your class
 * attributes. For that, you need to override toString().
 * 
 * If you/someone else logs your instance to see what it contains if you don’t
 * overridetoString() the output will only be the name and hash; that is not
 * very informative.
 */
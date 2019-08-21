package com.bridgelabz.libraries;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class BLStdOut {

	private static final String CHARSET_NAME = "UTF-8";

    // assume language = English, country = US for consistency with StdIn
    private static final Locale LOCALE = Locale.US;

	public static final String StdOut = null;

    // send output here
    private static PrintWriter out;

    // this is called before invoking any methods
    static 
    {
        try 
        {
            out = new PrintWriter(new OutputStreamWriter(System.out, CHARSET_NAME), true);
        }
        catch (UnsupportedEncodingException e) 
        {
            System.out.println(e);
        }
    }
    private void StdOut()
    { 
    } 
    public static void print(String x)
    {
        out.print(x);
        out.flush();
    }
    
    public static void println()
    {
        out.println();
    }

    public static void println(int x) 
    {
        out.println(x);
    }
    
    public static void println(boolean x) 
    {
        out.println(x);
    }
    public static void println(String x) 
    {
        out.println(x);
    }
    
    public static void printf(String format, Object... args) 
    {
        out.printf(LOCALE, format, args);
        out.flush();
    }
    public static void printf(Locale locale, String format, Object... args) 
    {
        out.printf(locale, format, args);
        out.flush();
    }
}

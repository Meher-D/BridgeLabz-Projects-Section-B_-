package com.bridgelabz.libraries;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;
public class BLStdIn 
{
	 private static final String CHARSET_NAME = "UTF-8";

	    // assume language = English, country = US for consistency with System.out.
	    private static final Locale LOCALE = Locale.US;

	    // the default token separator; we maintain the invariant that this value
	    // is held by the scanner's delimiter between calls
	    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\p{javaWhitespace}+");

	    // makes whitespace significant
	    private static final Pattern EMPTY_PATTERN = Pattern.compile("");

	    // used to read the entire input
	    private static final Pattern EVERYTHING_PATTERN = Pattern.compile("\\A");

	    /*** end: section (1 of 2) of code duplicated from In to StdIn. */

	    private static Scanner scanner;
	 
	    // it doesn't make sense to instantiate this class
	    private void StdIn() 
	    { 
	    	
	    }
	    public static boolean isEmpty() {
	        return !scanner.hasNext();
	    }

	 public static boolean hasNextLine() {
	        return scanner.hasNextLine();
	    }
	public static boolean hasNextChar() {
	        scanner.useDelimiter(EMPTY_PATTERN);
	        boolean result = scanner.hasNext();
	        scanner.useDelimiter(WHITESPACE_PATTERN);
	        return result;
	    }
	 public static String readLine() {
	        String line;
	        try {
	            line = scanner.nextLine();
	        }
	        catch (NoSuchElementException e) {
	            line = null;
	        }
	        return line;
	    }
	public static boolean readBoolean() {
	        try {
	            String token = readString();
	            if ("true".equalsIgnoreCase(token))  return true;
	            if ("false".equalsIgnoreCase(token)) return false;
	            if ("1".equals(token))               return true;
	            if ("0".equals(token))               return false;
	            throw new InputMismatchException("attempts to read a 'boolean' value from standard input, "
	                                           + "but the next token is \"" + token + "\"");
	        }
	        catch (NoSuchElementException e) {
	            throw new NoSuchElementException("attempts to read a 'boolean' value from standard input, "
	                                           + "but no more tokens are available");
	        }

	    }
	public static String[] readAllStrings()
	{
	        // we could use readAll.trim().split(), but that's not consistent
	        // because trim() uses characters 0x00..0x20 as whitespace
	        String[] tokens = WHITESPACE_PATTERN.split(readAll());
	        if (tokens.length == 0 || tokens[0].length() > 0)
	            return tokens;

	        // don't include first token if it is leading whitespace
	        String[] decapitokens = new String[tokens.length-1];
	        for (int i = 0; i < tokens.length - 1; i++)
	            decapitokens[i] = tokens[i+1];
	        return decapitokens;
	 }
	 public static String[] readAllLines() {
	        ArrayList<String> lines = new ArrayList<String>();
	        while (hasNextLine()) {
	            lines.add(readLine());
	        }
	        return lines.toArray(new String[lines.size()]);
	    }
	public static int[] readAllInts() {
	        String[] fields = readAllStrings();
	        int[] vals = new int[fields.length];
	        for (int i = 0; i < fields.length; i++)
	            vals[i] = Integer.parseInt(fields[i]);
	        return vals;
	    } 
	public static double[] readAllDoubles() {
	        String[] fields = readAllStrings();
	        double[] vals = new double[fields.length];
	        for (int i = 0; i < fields.length; i++)
	            vals[i] = Double.parseDouble(fields[i]);
	        return vals;
	    }
	/*static {
	        resync();
	    }
	 /*private static void resync() {
	        setScanner(new Scanner(new java.io.BufferedInputStream(System.in), CHARSET_NAME));
	    }
	    
	    private static void setScanner(Scanner scanner) {
	        StdIn.scanner = scanner;
	        StdIn.scanner.useLocale(LOCALE);
	    }*/
	 public static int readInt() {
	        try {
	            return scanner.nextInt();
	        }
	        catch (InputMismatchException e) {
	            String token = scanner.next();
	            throw new InputMismatchException("attempts to read an 'int' value from standard input, "
	                                           + "but the next token is \"" + token + "\"");
	        }
	        catch (NoSuchElementException e) {
	            throw new NoSuchElementException("attemps to read an 'int' value from standard input, "
	                                           + "but no more tokens are available");
	        }

	    }
	public static int[] readInts() {
	        return readAllInts();
	    }
	 public static String readString() {
	        try {
	            return scanner.next();
	        }
	        catch (NoSuchElementException e) {
	            throw new NoSuchElementException("attempts to read a 'String' value from standard input, "
	                                           + "but no more tokens are available");
	        }
	    }
	public static String[] readStrings() {
	        return readAllStrings();
	    }
	 public static double readDouble() {
	        try {
	            return scanner.nextDouble();
	        }
	        catch (InputMismatchException e) {
	            String token = scanner.next();
	            throw new InputMismatchException("attempts to read a 'double' value from standard input, "
	                                           + "but the next token is \"" + token + "\"");
	        }
	        catch (NoSuchElementException e) {
	            throw new NoSuchElementException("attempts to read a 'double' value from standard input, "
	                                           + "but no more tokens are available");
	        }
	    }
	public static double[] readDoubles() {
	        return readAllDoubles();
	    }
	 public static String readAll() {
	        if (!scanner.hasNextLine())
	            return "";

	        String result = scanner.useDelimiter(EVERYTHING_PATTERN).next();
	        // not that important to reset delimeter, since now scanner is empty
	        scanner.useDelimiter(WHITESPACE_PATTERN); // but let's do it anyway
	        return result;
	    }

	 public static char readChar() {
	        try {
	            scanner.useDelimiter(EMPTY_PATTERN);
	            String ch = scanner.next();
	            assert ch.length() == 1 : "Internal (Std)In.readChar() error!"
	                + " Please contact the authors.";
	            scanner.useDelimiter(WHITESPACE_PATTERN);
	            return ch.charAt(0);
	        }
	        catch (NoSuchElementException e) {
	            throw new NoSuchElementException("attempts to read a 'char' value from standard input, "
	                                           + "but no more tokens are available");
	        }
	    }  
}

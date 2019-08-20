package com.bridgelabz.libraries;

import java.util.Random;

public class BLRandom {

	public static final class StdRandom {

		    private static Random random;    
		    private static long seed;       

		   
		    static 
		    {
		      
		        seed = System.currentTimeMillis();
		        random = new Random(seed);
		    }

		  
		
		    private StdRandom() 
		    { 
		    	
		    }
		    
		    public static void setSeed(long s) {
		        seed   = s;
		        random = new Random(seed);
		    }

		    public static double uniform() 
		    {
		        return random.nextDouble();
		    }
		    public static int uniform(int n) 
		    {
		        if (n <= 0) throw new IllegalArgumentException("argument must be positive: " + n);
		        return random.nextInt(n);
		    }
		    public static double uniform(double a, double b) {
		        if (!(a < b)) 
		        {
		            throw new IllegalArgumentException("invalid range: [" + a + ", " + b + ")");
		        }
		        return a + uniform() * (b-a);
		    }
	}
	
	public static boolean bernoulli(double p) 
	{
        if (!(p >= 0.0 && p <= 1.0))
            throw new IllegalArgumentException("probability p must be between 0.0 and 1.0: " + p);
        return uniform() < p;
    }
	 public static boolean bernoulli() {
		 
	        return bernoulli(0.5);
	    }
  

   
    public static double gaussian() {
     
        double r, x, y;
        do {
            x = uniform(-1.0, 1.0);
            y = uniform(-1.0, 1.0);
            r = x*x + y*y;
        } while (r >= 1 || r == 0);
        return x * Math.sqrt(-2 * Math.log(r) / r);

      
    }

    public static double gaussian(double mu, double sigma) {
        return mu + sigma * gaussian();
    }
    
    public static int discrete(double[] probabilities)
    {
        if (probabilities == null) throw new IllegalArgumentException("argument array is null");
        double EPSILON = 1.0E-14;
        double sum = 0.0;
        for (int i = 0; i < probabilities.length; i++) 
        {
            if (!(probabilities[i] >= 0.0))
                throw new IllegalArgumentException("array entry " + i + " must be nonnegative: " + probabilities[i]);
            sum += probabilities[i];
        }
        if (sum > 1.0 + EPSILON || sum < 1.0 - EPSILON)
            throw new IllegalArgumentException("sum of array entries does not approximately equal 1.0: " + sum);

        
        while (true) 
        {
            double r = uniform();
            sum = 0.0;
            for (int i = 0; i < probabilities.length; i++) {
                sum = sum + probabilities[i];
                if (sum > r) return i;
            }
        }
    }
    public static void shuffle(double[] a) 
    {
        validateNotNull(a);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + uniform(n-i);     // between i and n-1
            double temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
    ublic static void shuffle(Object[] a) {
        validateNotNull(a);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + uniform(n-i);     // between i and n-1
            Object temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}

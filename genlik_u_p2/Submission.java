

// Umut Can Genlik 
//CS333 Assignment 1
/**
 *
 * @author ugenlik1
 */

import java.io.*;

public class Submission {
    
    /**
     * @param args the command line arguments
     */
    private static int n;
    private static double m, p[], w[];
    
    
    
    private static void read(String in , String out , int mod){
        
        try {
            
            
            BufferedReader bufRead = new BufferedReader(new FileReader(in));
            PrintWriter pw = new PrintWriter(new FileWriter(out), true); 
            
            String line;
            
            line = bufRead.readLine();
            
            while (line != null) {
                //long startTime = System.nanoTime();
                
                long startTime = System.currentTimeMillis();
                
                String[] v = line.split(" ");
                n = Integer.valueOf(v[0]);
                m = Integer.valueOf(v[1]);
                
                w = new double[n];
                p = new double[n];
                
                for (int i = 0; i < n; i++) {
                    
                    line = bufRead.readLine();
                    v = line.split(" ");
                    w[i] = Integer.valueOf(v[0]);
                    p[i] = Integer.valueOf(v[1]);
                }
                
                double bestProfit = 0;
                double mostProfit = 0;
                if(mod==0){
                    sort();
                    bestProfit = fill();
                }
                else if(mod==1){
                    sort();
                    bestProfit = fill();
                    sort_improv();
                    mostProfit = p[0];
                }
                if(bestProfit>mostProfit){
                    
                    long estimatedTime = System.currentTimeMillis() - startTime;
                    
                    
                    pw.println(n + " " + bestProfit + " " + (estimatedTime));
                }
                else{
                    
                    long estimatedTime = System.currentTimeMillis() - startTime;
                    
                    
                    pw.println(n + " " + mostProfit + " " + (estimatedTime));
                    
                }
                
                
                
                
                
                
                //long estimatedTime = System.nanoTime() - startTime;
                
                
                
                
                
                line = bufRead.readLine();
                
            }
            
            bufRead.close();
            pw.close();
            
        } catch (IOException e) {
        }
        
        
    }
    
    private static void sort(){
        
        
        for(int i=n-1;i>=0;i--)
            for(int j=0;j<i;j++)
                
                if((p[j]/w[j]) < (p[j+1]/w[j+1]))
                {
                    double t;
                    t=p[j];
                    p[j]=p[j+1];
                    p[j+1]=t;
                    t=w[j];
                    w[j]=w[j+1];
                    w[j+1]=t;
                }
    }
    
    private static void sort_improv(){
        
        
        for(int i=n-1;i>=0;i--)
            for(int j=0;j<i;j++)
                
                if(p[j] < p[j+1])
                {
                    double t;
                    t=p[j];
                    p[j]=p[j+1];
                    p[j+1]=t;
                    t=w[j];
                    w[j]=w[j+1];
                    w[j+1]=t;
                }
    }
    
    
    private static double fill(){
        int x[]=new int[n+1];
        int i;
        double profit=0;
        for( i=1;i<=n;i++)
            x[i]=0;
        
        for( i=0;i<n;i++)
        {
            if(m-w[i]>=0)
            {
                
                m=m-w[i];
                profit=profit+p[i];
                x[i]=1;
            }
            else
                break;
        }
        
        
        
        
        return profit;
    }
    
    
    
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String first = args[0];
        
        String second = args[1];
        
        int mode = Integer.parseInt(args[2]);
        
        read(first,second, mode);
        
    }
}

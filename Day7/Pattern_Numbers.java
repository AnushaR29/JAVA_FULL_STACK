package Day7;
public class Pattern_Numbers{
    public static void main(String[] args) {
        int n = 5;
        int m = n/2+1;

        for (int i = 1; i <= n; i++) {
            for(int j = 1, k = 5; j<=n;j++,k--)    {
                if (i == 1 || i == n || j == 1 || j == n ) { //zero
                    System.out.print("* "); 
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();  
        }
        System.out.println("\n\n");
        for (int i = 1; i <= n; i++) {
            for(int j = 1, k = 5; j<=n;j++,k--)    {
                if ((i == 1 && j<=m)|| j==m || i ==n ) { //one
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
        System.out.println("\n\n");
        for (int i = 1; i <= n; i++) {
            for(int j = 1, k = 5; j<=n;j++,k--)    {
                if (i == 1 || i == m || i == n||(j==n && i<=m)||(j==1 && i>=m)) { //two
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();  
        }
        System.out.println("\n\n");
        for(int i = 1; i<=n;i++)
        {
            for(int j = 1, k = 5; j<=n;j++,k--)
            {  
                if(i == 1 || i == m || i == n || j == n) // three
                System.out.print("* ");
                else 
                System.out.print("  ");
            }
            System.out.println();
    }
    System.out.println("\n\n");
     for(int i = 1; i<=n;i++)
        {
            for(int j = 1, k = 5; j<=n;j++,k--)
            {  
                if((j == 1 && i!=n)||(i == (n-1))||(j==m && i>=m)) // four
                System.out.print("* ");
                else 
                System.out.print("  ");
            }
            System.out.println();
    }
    System.out.println("\n\n");
    for (int i = 1; i <= n; i++) {
            for(int j = 1, k = 5; j<=n;j++,k--)    {
                if (i == 1 || i == m || i == n||(j==1 && i<=m)||(j==n && i>=m)) { //five
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();  
        }
        System.out.println("\n\n");
        for (int i = 1; i <= n; i++) {
            for(int j = 1, k = 5; j<=n;j++,k--)    {
                if (j == 1 || i == 1||i == n || i == m || (j==n && i>=m)) { //six
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();  
        }
        System.out.println("\n\n");
        for (int i = 1; i <= n; i++) {
            for(int j = 1, k = 5; j<=n;j++,k--)    {
                if ((i == 1 && j!=n) || j == (n-1)||((i == m && j!=1))) { //seven
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();  
        }
        System.out.println("\n\n");
        for (int i = 1; i <= n; i++) {
            for(int j = 1, k = 5; j<=n;j++,k--)    {
                if (j == 1 || i == 1||i == n || i == m || j==n ) { //eight
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();  
        }
        System.out.println("\n\n");
        for (int i = 1; i <= n; i++) {
            for(int j = 1, k = 5; j<=n;j++,k--)    {
                if ((j == 1 && i<=m )|| i == 1||i == n || i == m || j==n) { //nine
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();  
        }
        System.out.println("\n\n");
    }
}

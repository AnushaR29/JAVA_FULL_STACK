package Day8;
public class BA {
    public static void main(String[] args) {
         int num=5;
        int m=(num/2)+1;
        for(int i=1; i<=num;i++){
            for (int j=1;j<=num;j++){
                if(i==1||i==num||i==m||j==1||j==num)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
            }
            System.out.println( "");
        }
        System.out.println( "");

         for(int i=1; i<=num;i++){
            for (int j=1;j<=num;j++){
                if(i==1||i==m||j==1||j==num)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
            }
            System.out.println( "");
        }
        System.out.println( "");

         for(int i=1; i<=num;i++){
            for (int j=1;j<=num;j++){
                if(j==2||(i==1&&j>=m)||(j==num&&i<=m)||(i==m&&j>=m)||(i==j&&i>=m))
                    System.out.print("* ");
                    else
                    System.out.print("  ");
            }
            System.out.println( "");
        }
        System.out.println( "");

         for(int i=1; i<=num;i++){
            for (int j=1;j<=num;j++){
                if(i==1||i==m||j==1||j==num)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
            }
            System.out.println( "");
        }
        System.out.println( "");

        for(int i=1; i<=num;i++){
            for (int j=1;j<=num;j++){
                if(j==1||i==j||j==num)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
            }
            System.out.println( "");
        }
        System.out.println( "");

         for(int i=1; i<=num;i++){
            for (int j=1;j<=num;j++){
                if(i==1||i==num||j==m)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
            }
            System.out.println( "");
        }
        System.out.println( "");
        System.out.println();
        System.out.println();

          for(int i=1; i<=num;i++){
            for (int j=1,k=num;j<=num;j++,k--){
                if(j==1||j==num||(i==k&&i>=m)||(i==j&&i>=m))
                    System.out.print("* ");
                    else
                    System.out.print("  ");
            }
            System.out.println( "");
        }
        System.out.println( "");

         for(int i=1; i<=num;i++){
            for (int j=1;j<=num;j++){
                if(i==1||i==m||j==1||i==num)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
            }
            System.out.println( "");
        }
        System.out.println( "");

         for(int i=1; i<=num;i++){
            for (int j=1;j<=num;j++){
                if(i==1||j==2||i==num||j==num)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
            }
            System.out.println( "");
        }
        System.out.println( "");

         for(int i=1; i<=num;i++){
            for (int j=1;j<=num;j++){
                if(i==1||i==m||i==num||(j==1&&i<=m)||(j==num&&i>=m))
                    System.out.print("* ");
                    else
                    System.out.print("  ");
            }
            System.out.println( "");
        }
        System.out.println( "");

        System.out.println();
        System.out.println();
        System.out.println();

        for(int i=1; i<=num;i++){
            for (int j=1;j<=num;j++){
                if(i==1||i==m||j==1||j==num)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
            }
            System.out.println( "");
        }
        System.out.println( "");

         for(int i=1; i<=num;i++){
            for (int j=1;j<=num;j++){
                if(j==1||i==j||j==num)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
            }
            System.out.println( "");
        }
        System.out.println( "");
        
         for(int i=1; i<=num;i++){
            for (int j=1;j<=num;j++){
                if(j==1||j==num||i==num)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
            }
            System.out.println( "");
        }
        System.out.println( "");



    }
    
}
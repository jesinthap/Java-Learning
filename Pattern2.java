public class Pattern2 {
    public static void main(String[]args)
    {
        //1 1 1 1 1
        //2 2 2 2 2 
        //3 3 3 3 3
        //4 4 4 4 4
        //5 5 5 5 5

        
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=5;j++)
        //     {
        //         System.out.print(i +" ");
                
        //     }
        //     System.out.println("");
        // }


        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5
        //1 2 3 4 5

        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=5;j++)
        //     {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("");
        // }

        //5 5 5 5 5
        //4 4 4 4 4
        //3 3 3 3 3
        //2 2 2 2 2
        //1 1 1 1 1

        // for(int i=5;i>=1;i--)
        // {
        //     for(int j=1;j<=5;j++)
        //     {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println("");
        // }

        //5 4 3 2 1
        //5 4 3 2 1
        //5 4 3 2 1
        //5 4 3 2 1
        //5 4 3 2 1

        // for(int i=5;i>=1;i--)
        // {
        //     for(int j=5;j>=1;j--)
        //     {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("");
        // }

        //1 3 5 7 9
        //11 13 15 17 19
        //21 23 25 27 29
        //31 33 35 37 39
        //41 43 45 47 49

        // int k=1;
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=5;j++)
        //     {
        //         System.out.print(k+" ");
        //         k=k+2;
        //     }
        //     System.out.println("");
        // }


        //2 4 6 8 10
        //12 14 16 18 20
        //22 24 26 28 30
        //32 34 36 38 40
        //42 44 46 48 50

        // int k=2;
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=5;j++)
        //     {
        //         System.out.print(k+" ");
        //         k=k+2;
        //     }
        //     System.out.println("");
        // }

        //1
        //1 2
        //1 2 3
        //1 2 3 4
        //1 2 3 4 5

        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println("");
        // }


        //1
        //2 2
        //3 3 3
        //4 4 4 4
        //5 5 5 5 5

        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println("");
        // }

        //1
        //3 5
        //7 9 11
        //13 15 17 19
        //21 23 25 27 29

        // int k=1;
        // for(int i=1;i<=5;i++)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(k+" ");
        //         k=k+2;
        //     }
        //     System.out.println("");
        // }

        //1
        //2 3
        //4 5 6
        //7 8 9 10
        //11 12 13 14 15

         int k=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k=k+1;
            }
            System.out.println("");
        }

    }


    
}

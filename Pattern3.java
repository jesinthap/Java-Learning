public class Pattern3 {
    public static void main(String[] args) 
        {
            //A B C D E
            //F G H I J
            //K L M N O
            //P Q R S T
            //U V W X Y

            // char alpha='A';
            // for(int i=1;i<=5;i++)
            // {
            //     for(int j=1;j<=5;j++)
            //     {
            //         System.out.print(alpha+" ");
            //         alpha++;
            //     }
            //      System.out.println("");
            // }

            //A A A A A
            //B B B B B
            //C C C C C
            //D D D D D
            //E E E E E

            // for(char i='A';i<='E';i++)
            // {
            //     for(int j=1;j<=5;j++)
            //     {
            //         System.out.print(i+" ");
            //     }
            //     System.out.println(" ");
            // }

            //A B C D E
            //A B C D E
            //A B C D E
            //A B C D E
            //A B C D E

            // for(int i=1;i<=5;i++)
            // {
            //     for(char j='A';j<='E';j++)
            //     {
            //         System.out.print(j+" ");
            //     }
            //     System.out.println("");
            // }


            //E E E E E
            //D D D D D
            //C C C C C
            //B B B B B
            //A A A A A

            // for(char i='E';i>='A';i--)
            // {
            //     for(int j=1;j<=5;j++)
            //     {
            //         System.out.print(i+" ");
            //     }
            //     System.out.println("");
            // }

            //E D C B A
            //E D C B A
            //E D C B A
            //E D C B A
            //E D C B A

            // for(int i=1;i<=5;i++)
            // {
            //     for(char j='E';j>='A';j--)
            //     {
            //         System.out.print(j+" ");
            //     }
            //     System.out.println("");
            // }


            //E
            //E D
            //E D C
            //E D C B
            //E D C B A

           
            for(char i=1;i<=5;i++)
            {   
                 char alpha='E';
                for(int j=1;j<=i;j++)
                {
                    System.out.print(alpha+" ");
                    alpha--;
                }
                System.out.println("");
                
            }
            

        }
    }
    


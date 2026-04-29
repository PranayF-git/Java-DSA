class Patterns{
    public static void main(String args[]) {
        int n = 4;
        int m = 5;
        // filled rectangle pattern
        // for(int i=0; i<4; i++){
        //     for (int j = 1; j < 5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("*");
        // }

        // Hollow rectangle
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         if (i == 1 || j == 1 || i == n || j == m) {
        //             System.out.print('*');
        //         } else {
        //             System.out.print(' ');
        //         }
        //     }
        //     System.out.println();
        // }

        // Pyramid pattern
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Inverted pyramid
        // for (int i = n; i >= 1; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Inverted half pyramid
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }

        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Increasing Number pyramid
        // for (int i = 1; i <= m; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        // Decreasing num pyaramid
        // for (int i = 1; i <= m; i++) {
        //     for (int j = 1; j <= m - i + 1; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        
        // Floyd's triangle
        // int num = 1;
        // for (int i = 1; i <= m; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }
        
        // Even odd(0 & 1) triangle
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
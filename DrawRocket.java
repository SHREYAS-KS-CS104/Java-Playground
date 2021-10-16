public class DrawRocket {
	public static final int SIZE = 6;
	public static void main (String[] args) {
		rocketTop();
		rocketLine();
		rocketUpMid();
		rocketLowMid();
		rocketLine();
		rocketLowMid();
		rocketUpMid();
		rocketLine();
		rocketTop();
	}

	public static void rocketTop(){
		for(int i = 1;i <= (SIZE * 2 - 1);i++){
			for(int j = 1; j <= (i * -1 + SIZE * 2);j++){
				System.out.print(" ");
			}
			for(int k = 1; k <= i;k++){
				System.out.print("/");
			}
			System.out.print("**");
			for(int k = 1; k <= i;k++){
                                System.out.print("\\");
                       }
			System.out.println();
		}
		
	}
	public static void rocketLine(){
		System.out.print("+");
		for(int i = 1; i<= (SIZE * 2);i++){
			System.out.print("=*");
		}
		System.out.println("+");
	}
	public static void rocketUpMid(){
		for(int i = 0;i < SIZE;i++){
		        System.out.print("|");
			for(int j = 0; j < ( -1 * i + (SIZE -1));j++){
				System.out.print(".");
			}
			for(int k = 0; k < ( i +1 );k++){
				System.out.print("/\\");
			}
			for(int j = 1; j <=(-2 * i + (2 * SIZE - 2));j++){
				System.out.print(".");
			}
			for(int k = 0; k < ( i +1 );k++){
                                System.out.print("/\\");
                        }
			for(int j = 0; j < (-1 * i + (SIZE-1)); j++){
				System.out.print(".");
			}
			System.out.println("|");
		}

	}
	public static void rocketLowMid(){
		for(int i = 0;i < SIZE; i++){
		         System.out.print("|");
                           for(int j = 0; j < i;j++){
                                   System.out.print(".");
                           }
                           for(int k = 0; k < ( -1 * i + SIZE);k++){
                                   System.out.print("\\/");
                           }
                           for(int j = 0 ; j <=(2 * i -1);j++){
                                   System.out.print(".");
                           }
                         for(int k = 0; k < ( -1 * i + SIZE );k++){
                                   System.out.print("\\/");
                           }
                           for(int j = 0; j <  i; j++){
                                   System.out.print(".");
                           }
                           System.out.println("|");
                   }
	}

}


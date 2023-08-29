public static void main(String[] args) {
        /*
            CONDICIONALES
        
            LOS CONDICIONALES NOS PERMITEN VERIFICAR SI LA ACCIÓN
            SE CUMPLE Y EJECUTAR UN CONJUNTO DE ACCIONES

	        OPERADORES LÓGICOS
                == ES IGUAL
                = IGUAL
                != ES DISTINTO
                < MENOR
                <= MENOR O IGUAL
                > MAYOR
                >= MAYOR O IGUAL
                && OPERADOR AND (Y)
                || OPERADOR OR (O)
                ! OPERADOR NOT (NO)
        */
        
        //CONDICIONAL IF
        boolean condicion = true;
        if(condicion){
            System.out.println("Es verdadero");
        }
        
        //CONDICIONAL IF AND ELSE
        if(1 < 2){
            System.out.println("1 es menor");
        }else{
            System.out.println("1 Es menor");
        }
        
        int a = 10;
        //CONDICIONAL IF AND ELSE IF
        if(a < 10){
            System.out.println("A es menor");
        }else if( a > 10){
            System.out.println("A es mayor");
        }else{
            System.out.println("A es igual a 10");
        }

        int temperatura = 20;
        boolean sol = true;
        boolean nevando = true;

        // Si la temperatura es mayor que 25
        if (temperatura > 25) {
            System.out.println("A la playa!!!");
        }

        // Si sol es vedadero  
        if (sol) {
            System.out.println("No te olvides del bloqueador");
        }

        // Si esta nevando o hace sol
        if (nevando || sol) {
            System.out.println("Me agrada el clima");
        }

        // Si la temperatura es menor que 0 o mayor que 30 y hace sol
        if ((temperatura < 0 || temperatura > 30) && sol) {
            System.out.println("Me quedaré en casa");
        }
    }
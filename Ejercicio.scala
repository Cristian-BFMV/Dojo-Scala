object Ejercicio{
    def main(args: Array[String]): Unit = { 
        val numeros = List(4, 8, 15, 16, 23, 42)
        
        val numeros2 = numeros.map(x => x*2)
        print(numeros2)
        
    }
    
}
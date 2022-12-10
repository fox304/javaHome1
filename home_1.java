/*
 
                        +Реализовать функцию возведения числа а в степень b. a, b ∈ Z. 
                        Сводя количество выполняемых действий к минимуму.
                        Пример 1: а = 3, b = 2, ответ: 9
                        Пример 2: а = 2, b = -2, ответ: 0.25
                        Пример 3: а = 3, b = 0, ответ: 1
                        Пример 4: а = 0, b = 0, ответ: не определено
                        Пример 5
                        входные данные находятся в файле input.txt в виде
                        b 3
                        a 10
                        Результат нужно сохранить в файле output.txt
                        1000

 */

package home_task;
import java.io.*;

public class home_1 {
    public static void main(String[] args) throws IOException {
        FileWriter myfirstfile = new FileWriter("input.txt",false);
            myfirstfile.write("b 3\n");
            myfirstfile.write("a 10\n");
            myfirstfile.write("b 2\n");
            myfirstfile.write("a 12\n");                         /*      запись данных в файл        */
            myfirstfile.write("b -2\n");
            myfirstfile.write("a 2\n");
            myfirstfile.write("b 0\n");
            myfirstfile.write("a 0");
            myfirstfile.close();

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        FileWriter mysecondfile = new FileWriter("output.txt",false);
            String str;
            
            Byte a,b;
            
            while((str = br.readLine()) != null) {
                 
                str = str.split("\n")[0].split(" ")[1];           // распарсили первую строку 
                b = Byte.parseByte(str);

                str = br.readLine().split("\n")[0].split(" ")[1]; // распарсили вторую строку
                a = Byte.parseByte(str);

                if (a == 0 && b == 0) str = "не определено";
                else str = Double.toString(Math.pow(a,b));

                mysecondfile.write(str); 
                mysecondfile.append("\n");
            }                
            mysecondfile.close();
            br.close();
    
    }
}


        
        
    
        
    

    
    
    



package io.github.talentdevelopment004.strings;

import java.io.IOException;

 class X {
    public void printFileContent() throws IOException {

            throw  new IOException();

    }
}
public class  Test{
    public static void main(String[] args) throws Exception {
        X obj=new X();
        obj.printFileContent();
       /* try {
            obj.printFileContent();
    }
        // can only be the last catch
        catch (Exception e){
            System.out.println("e.getMessage() = " + e.getMessage());
        }
        catch (IOException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }*/

    }
}

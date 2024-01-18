public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String string = "Hola cOMo ES";
        System.out.println(capVowelsLowRest(string));
    }

    public static String capVowelsLowRest(String string) {
        String answer = " ";
        String finalAnswer = " ";
        char currentChar;
        int length = string.length();
        for (int i = 0; i < length; i++) {
            currentChar = string.charAt(i);
            if (65 <= currentChar && currentChar <= 90) {
                currentChar = (char) (currentChar + 32);
                answer = answer + currentChar;
            } else {
                currentChar = (char) (currentChar);
                answer = answer + currentChar;
            }

        }

        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == 'a')
                finalAnswer = finalAnswer + ((char) (answer.charAt(i) - 32));
            else if (answer.charAt(i) == 'e')
                finalAnswer = finalAnswer + ((char) (answer.charAt(i) - 32));
            else if (answer.charAt(i) == 'i')
                finalAnswer = finalAnswer + ((char) (answer.charAt(i) - 32));
            else if (answer.charAt(i) == 'o')
                finalAnswer = finalAnswer + ((char) (answer.charAt(i) - 32));
            else if (answer.charAt(i) == 'u')
                finalAnswer = finalAnswer + ((char) (answer.charAt(i) - 32));
            else
                finalAnswer = finalAnswer + answer.charAt(i);
        }
        return finalAnswer;

    }

    private static char characterToUpperCase(char character) {
        if (character >= 97 && character <= 122) {
            return (char)(character - 32);
        }
        return character;
    }
    private static char characterToLowerCase(char character) {
        if (character >= 65 && character <= 90) {
            return (char)(character + 32);
        }
        return character;
    }

    public static String camelCase(String string) {
        String answer = " ";

        for (int i= 0; i<string.length(); i++){
            while(string.charAt(i) == ' '){
                i++;
            }
            if(answer!= "" && string.charAt(i - 1) == ' '){
                answer = answer + characterToUpperCase(string.charAt(i));
            }
            else{
                answer  = answer + characterToLowerCase(string.charAt(i));
            }
        }
        return answer;
    }

    public static int[] allIndexOf(String string, char chr) {
        int counter =0;
        // we go over the string characters and count them do decide the size of the  array
        for (int i= 0; i<string.length(); i++){
            if(string.charAt(i)== chr){
                counter++;
            }

        }
        int[] array = new int[counter]; //the size of the arrayn is the amount of times the character repeats  itself
        int indexInArray = 0;
        //loop that fills up the array with the inex value of the character in the given string 
        for (int i= 0; i<string.length(); i++){
            if(string.charAt(i)== chr){
                array[indexInArray]= i;
                indexInArray++;
            }
        }
        
        return array;
    }
}

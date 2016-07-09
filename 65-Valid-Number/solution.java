public class Solution {
    public boolean isNumber(String s) {
        assert(s != null);
        int index = 0;
        int size = s.length();
        char[] charArray = s.toCharArray();
        boolean isValid = false;
        while(index < size && charArray[index] == ' ') { index++; };
        
        if(index < size && (charArray[index] == '+' || charArray[index] == '-')) { index++; }
        
        while(index < size && Character.isDigit(charArray[index])) {
            isValid = true;
            index++;
        }
        
        if(index < size && charArray[index] == '.') {
            index++;
            while(index < size && Character.isDigit(charArray[index])) {
                isValid = true;
                index++;
            }
        }
        
        if(isValid && index < size && (charArray[index] == 'e' || charArray[index] == 'E')) {
            isValid = false;
            index++;
            if(index < size && (charArray[index] == '+' || charArray[index] == '-')) {
                index++;
            }
            
            while(index < size && Character.isDigit(charArray[index])) {
                isValid = true;
                index++;
            }
        }
        
        while(index < size && charArray[index] == ' ') { index++; }
        
        return isValid && index == size;
    }
}
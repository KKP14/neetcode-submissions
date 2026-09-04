class Solution {
    public boolean isPalindrome(String s) {
        String reversedString = s.replaceAll("[^a-zA-Z0-9]","");
        reversedString = new StringBuilder(reversedString).reverse().toString();
        s = s.replaceAll("[^a-zA-Z0-9]","");
        if(reversedString.equalsIgnoreCase(s)){
            return true;
        }

        return false;

    }
}

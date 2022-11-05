public class PalindromeNumber {
        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }
            int reverseNumber = 0;
            int originalNumber = x;
            while (x != 0) {
                reverseNumber = reverseNumber * 10 + x % 10;
                x = x / 10;
            }
            return reverseNumber == originalNumber;
        }
}

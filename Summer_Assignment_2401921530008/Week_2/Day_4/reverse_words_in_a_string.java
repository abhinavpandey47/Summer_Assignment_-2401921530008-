class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();

        for (String w : arr) {
            res.append(new StringBuilder(w).reverse()).append(" ");
        }

        return res.toString().trim();
    }
}
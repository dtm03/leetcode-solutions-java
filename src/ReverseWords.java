public class ReverseWords {
    public static String reverseWords(final String original)
    {
        String[] arr = original.split(" ");
        if (arr.length == 0) return original;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
        }
        return String.join(" ", arr);
    }
}

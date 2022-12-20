class Main{
    static void mysort(char arr[]){
        int n = arr.length; 
        for (int i = 0; i < n-1; i++){
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            char temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String []args){
        String str = "asdfg";
        int len = str.length();
        
        char ch[] = new char[len];
        for(int i=0 ; i<len ; i++){
            ch[i] = str.charAt(i);
        }
        System.out.print("Before Sorting : ");
        System.out.println(ch);
        mysort(ch);
        System.out.print("After Sorting : ");
        System.out.print(ch);
    }
}
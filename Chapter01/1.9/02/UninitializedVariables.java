/*
練習問題１．９
２．コンパイルしようとすると何が起こるか

エラー
変数が初期化されていない
*/

class UninitializedVariables{
  public static void main(String args[]){
    char c;
    boolean flag;
    System.out.println(c);
    System.out.println(flag);
  }
}

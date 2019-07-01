import java.util.ArrayList;
import java.util.List;

public class InputString {

    public List<String> inputToListSentence (String input){
        List<String> listSentence = new ArrayList<String>();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.toString(input.charAt(i)).matches("[!?.]")) {
                String temp = "";
                do {
                    temp += input.charAt(i);
                    if (i + 1 == input.length())
                        break;
                    i++;
                } while (!Character.toString(input.charAt(i)).matches("[!?.]"));
                listSentence.add(temp);
            }
        }
        return listSentence;
    }

    public List<String> listSentenceInListWord(String input){
        List<String> listSentence = inputToListSentence(input) ;
        List<String> listWord = new ArrayList<String>();
        for (String Sentence:listSentence) {
            List<String> listTemp = new ArrayList<String>();
            for (int i = 0; i < Sentence.length(); i++) {
                if (Sentence.charAt(i) != ' '){
                    String temp = "";
                    do {
                        if (i+1 == Sentence.length()) {
                            temp += Sentence.charAt(i);
                            break;
                        }
                        temp += Sentence.charAt(i);
                        i++;
                    }while (Sentence.charAt(i) != ' ');
                    listTemp.add(temp);
                }
            }
            for (int i = 1; i < listTemp.size(); i++) {
                listWord.add(listTemp.get(i));
            }
        }
        return listWord;
    }

    public List<String> listIsMathRegexOwn(String input){
        List<String> listWord = listSentenceInListWord(input) ;
        for (int i = 0; i < listWord.size(); i++) {
            if (!isMathRegexOwn(listWord.get(i))){
                listWord.remove(i);
                i--;
            }
        }
        return listWord;
    }

    public String getString(String input){
        List<String> list = listIsMathRegexOwn(input) ;
        String str = list.toString();
        return str.substring(1,str.length()-1);

    }

    public boolean isMathRegexOwn(String word){
        return word.matches("[А-Я][А-Яа-я]*");
    }

}

package com.megajava.youcando.question;

import com.megajava.youcando.user.UserDTO;
import com.megajava.youcando.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
    private final UserDTO user;
    private final UserRepository userRepository;

    public QuestionService(UserDTO user, UserRepository userRepository) {
        this.user = user;
        this.userRepository = userRepository;
    }

    public void checkEI(String answer) {
        if (answer.equals("E")) {
            user.addECount();
        } else if (answer.equals("I")) {
            user.addICount();
        }
    }

    public void checkNS(String answer) {
        if (answer.equals("N")) {
            user.addNCount();
        } else if (answer.equals("S")) {
            user.addSCount();
        }
    }

    public void checkTF(String answer) {
        if (answer.equals("T")) {
            user.addTCount();
        } else if (answer.equals("F")) {
            user.addFCount();
        }
    }

    public void checkPJ(String answer) {
        if (answer.equals("P")) {
            user.addPCount();
        } else if (answer.equals("J")) {
            user.addJCount();
        }
    }

    public String resultMapping() {
        int e = user.geteCount();
        int i = user.getiCount();
        int n = user.getnCount();
        int s = user.getsCount();
        int t = user.gettCount();
        int f = user.getfCount();
        int p = user.getpCount();
        int j = user.getjCount();

        String resultEI = checkType(e, i);
        String resultNS = checkType(n, s);
        String resultTF = checkType(t, f);
        String resultPJ = checkType(p, j);

        String mbti = resultEI + resultNS + resultTF + resultPJ;
        String finalResult = setFinalResult(mbti);

        userRepository.setResult(finalResult);

        return finalResult;
    }

    private String setFinalResult(String mbti) {
        String finalResult;
        switch (mbti) {
            case "intp":
            case "istp":
                finalResult = "A";
                break;
            case "infp":
            case "isfp":
                finalResult = "B";
                break;
            case "entp":
            case "estp":
                finalResult = "C";
                break;
            case "enfp":
            case "esfp":
                finalResult = "D";
                break;
            case "estj":
            case "entj":
                finalResult = "E";
                break;
            case "infj":
            case "isfj":
                finalResult = "F";
                break;
            case "istj":
            case "intj":
                finalResult = "G";
                break;
            case "enfj":
            case "esfj":
                finalResult = "H";
                break;
            default:
                finalResult = "Unknown";
                break;
        }
        return finalResult;
    }

    public String checkType(int a, int b) {
        return (a > b) ? String.valueOf(a) : String.valueOf(b);
    }



}

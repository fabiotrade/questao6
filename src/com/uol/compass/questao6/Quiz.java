package com.uol.compass.questao6;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        String q1 = "O potássio é um:\n"
                + "(a) macronutriente.\n(b) micronutriente.\n(c) fitorregulador.\n";

        String q2 = "A totipotencialidade é uma propriedade:\n"
                + "(a) comum em todas as células vegetais.\n(b) incomum nas células vegetais.\n(c) comum apenas em células in vitro.";

        String q3 = "Células meristemáticas são:\n"
                + " (a) não diferenciadas.\n (b)altamente especializadas.\n (c) não são células vegetais.";

        String q4 = "A clonagem vegetal in vitro:\n"
                + " (a) permite a propagação do DNA original da planta doadora. \n (b) não permite a manutenção do DNA da planta doadora.\n (c) não influencia na manutenção do DNA da planta doadora.";

        String q5 = "A conicidade de uma árvore:\n"
                + " (a) é uma característica exclusivamente genética da árvore.\n (b) é uma característica causada pelo ambiente.\n (c) as duas alternativas estão corretas.";

        String q6 = "Uma orquídea clonada in vitro:\n"
                + " (a) mantém as características apenas da flor original.\n (b) mantém apenas as características estruturais (raízes e folhas).\n (c) as duas alternativas estão corretas.";

        Question[]questions = {
                new Question(q1, "a"),
                new Question(q2, "a"),
                new Question(q3, "a"),
                new Question(q4, "a"),
                new Question(q5, "c"),
                new Question(q6, "c"),
        };
        takeTest(questions);

    }

    public static void takeTest(Question[] questions) {
        int score = 0;
        int errou = 0;
        Scanner keyboardInput = new Scanner(System.in);

        for (int i =0; i < questions.length; i++) {
            System.out.println(questions[i].getPrompt());
            String answer = keyboardInput.nextLine();
            if (answer.equals(questions[i].getAnswer())) {
                score++;
                System.out.println("Parabéns você acertou! >:)");
            }else{
                System.out.println("Você errou! <:(");
                errou++;
            }

        }
        System.out.println("Seus pontos foram: " + score );
        System.out.println("Seus erros foram: " + errou );

    }
}

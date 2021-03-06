package com.example.cmsc475app;

public class player_score {
    private String[] playerName;
    private int[] par;
    private int[] over_under;
    private int totalScore, totalPar, totalOverUnder;
    private int[] score;
//    private int[] hole;

    public void SetPlayer(String[] s){
        playerName = s;
    }
    public String[] GetPlayer(){
        return playerName;
    }

    public void SetPar(int[] s){
        par = s;
    }
    public int[] GetPar(){
        return par;
    }
    public void SetScore(int[] s){
        score = s;
    }
    public int[] GetScore(){
        return score;
    }

    public void SetOverUnder(int[] s, int[] x){
        for(int i = 0; i<19; i++){
            over_under[i] = s[i] + x[i];
        }
    }
    public int[] GetOverUnder(){
        return over_under;
    }

    public void SetTotalScore(int[] s){
        for(int i = 0; i<19;i++){
            totalScore += s[i];
        }
    }

    public int GetTotalScore(){
        return totalScore;
    }

    public void SetTotalPar(int[] s){
        for(int i = 0; i<19;i++){
            totalPar += s[i];
        }
    }

    public int GetTotalPar(){
        return totalPar;
    }

    public void SetTotalOver_Under(int[] s){
        for(int i = 0; i<19;i++){
            totalOverUnder += s[i];
        }
    }

    public int GetTotalOver_Under(){
        return totalOverUnder;
    }
}

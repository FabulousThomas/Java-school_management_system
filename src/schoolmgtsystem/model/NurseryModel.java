/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmgtsystem.model;

/**
 *
 * @author Thomas
 */
public class NurseryModel {
    
    String english1, english2, englishE, sound1, sound2, soundE, es1,
            es2, esE, social1, social2, socialE, health1, health2, healthE,
            com1, com2, comE, cca1, cca2, ccaE, writing1, writing2, writingE,
            rhymes1, rhymes2, rhymesE, verbal1, verbal2, verbalE, quan1, quan2,
            quanE, moral1, moral2, moralE;
    int SID;

    //Constructor
    public NurseryModel(String english1, String english2, String englishE, String sound1,
            String sound2, String soundE, String es1, String es2, String esE, String social1,
            String social2, String socialE, String health1, String health2, String healthE, 
            String com1, String com2, String comE, String cca1, String cca2, String ccaE, 
            String writing1, String writing2, String writingE, String rhymes1, String rhymes2,
            String rhymesE, String verbal1, String verbal2, String verbalE, String quan1, String 
                    quan2, String quanE, String moral1, String moral2, String moralE, int SID) {
        
        this.english1 = english1;
        this.english2 = english2;
        this.englishE = englishE;
        this.sound1 = sound1;
        this.sound2 = sound2;
        this.soundE = soundE;
        this.es1 = es1;
        this.es2 = es2;
        this.esE = esE;
        this.social1 = social1;
        this.social2 = social2;
        this.socialE = socialE;
        this.health1 = health1;
        this.health2 = health2;
        this.healthE = healthE;
        this.com1 = com1;
        this.com2 = com2;
        this.comE = comE;
        this.cca1 = cca1;
        this.cca2 = cca2;
        this.ccaE = ccaE;
        this.writing1 = writing1;
        this.writing2 = writing2;
        this.writingE = writingE;
        this.rhymes1 = rhymes1;
        this.rhymes2 = rhymes2;
        this.rhymesE = rhymesE;
        this.verbal1 = verbal1;
        this.verbal2 = verbal2;
        this.verbalE = verbalE;
        this.quan1 = quan1;
        this.quan2 = quan2;
        this.quanE = quanE;
        this.moral1 = moral1;
        this.moral2 = moral2;
        this.moralE = moralE;
        this.SID = SID;
    }
    

    //Getter and Setters
    public int getSID() {
        return SID;
    }

    public void setSID(int SID) {
        this.SID = SID;
    }

    public String getEnglish1() {
        return english1;
    }

    public void setEnglish1(String english1) {
        this.english1 = english1;
    }

    public String getEnglish2() {
        return english2;
    }

    public void setEnglish2(String english2) {
        this.english2 = english2;
    }

    public String getEnglishE() {
        return englishE;
    }

    public void setEnglishE(String englishE) {
        this.englishE = englishE;
    }

    public String getSound1() {
        return sound1;
    }

    public void setSound1(String sound1) {
        this.sound1 = sound1;
    }

    public String getSound2() {
        return sound2;
    }

    public void setSound2(String sound2) {
        this.sound2 = sound2;
    }

    public String getSoundE() {
        return soundE;
    }

    public void setSoundE(String soundE) {
        this.soundE = soundE;
    }

    public String getEs1() {
        return es1;
    }

    public void setEs1(String es1) {
        this.es1 = es1;
    }

    public String getEs2() {
        return es2;
    }

    public void setEs2(String es2) {
        this.es2 = es2;
    }

    public String getEsE() {
        return esE;
    }

    public void setEsE(String esE) {
        this.esE = esE;
    }

    public String getSocial1() {
        return social1;
    }

    public void setSocial1(String social1) {
        this.social1 = social1;
    }

    public String getSocial2() {
        return social2;
    }

    public void setSocial2(String social2) {
        this.social2 = social2;
    }

    public String getSocialE() {
        return socialE;
    }

    public void setSocialE(String socialE) {
        this.socialE = socialE;
    }

    public String getHealth1() {
        return health1;
    }

    public void setHealth1(String health1) {
        this.health1 = health1;
    }

    public String getHealth2() {
        return health2;
    }

    public void setHealth2(String health2) {
        this.health2 = health2;
    }

    public String getHealthE() {
        return healthE;
    }

    public void setHealthE(String healthE) {
        this.healthE = healthE;
    }

    public String getCom1() {
        return com1;
    }

    public void setCom1(String com1) {
        this.com1 = com1;
    }

    public String getCom2() {
        return com2;
    }

    public void setCom2(String com2) {
        this.com2 = com2;
    }

    public String getComE() {
        return comE;
    }

    public void setComE(String comE) {
        this.comE = comE;
    }

    public String getCca1() {
        return cca1;
    }

    public void setCca1(String cca1) {
        this.cca1 = cca1;
    }

    public String getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public String getCcaE() {
        return ccaE;
    }

    public void setCcaE(String ccaE) {
        this.ccaE = ccaE;
    }

    public String getWriting1() {
        return writing1;
    }

    public void setWriting1(String writing1) {
        this.writing1 = writing1;
    }

    public String getWriting2() {
        return writing2;
    }

    public void setWriting2(String writing2) {
        this.writing2 = writing2;
    }

    public String getWritingE() {
        return writingE;
    }

    public void setWritingE(String writingE) {
        this.writingE = writingE;
    }

    public String getRhymes1() {
        return rhymes1;
    }

    public void setRhymes1(String rhymes1) {
        this.rhymes1 = rhymes1;
    }

    public String getRhymes2() {
        return rhymes2;
    }

    public void setRhymes2(String rhymes2) {
        this.rhymes2 = rhymes2;
    }

    public String getRhymesE() {
        return rhymesE;
    }

    public void setRhymesE(String rhymesE) {
        this.rhymesE = rhymesE;
    }

    public String getVerbal1() {
        return verbal1;
    }

    public void setVerbal1(String verbal1) {
        this.verbal1 = verbal1;
    }

    public String getVerbal2() {
        return verbal2;
    }

    public void setVerbal2(String verbal2) {
        this.verbal2 = verbal2;
    }

    public String getVerbalE() {
        return verbalE;
    }

    public void setVerbalE(String verbalE) {
        this.verbalE = verbalE;
    }

    public String getQuan1() {
        return quan1;
    }

    public void setQuan1(String quan1) {
        this.quan1 = quan1;
    }

    public String getQuan2() {
        return quan2;
    }

    public void setQuan2(String quan2) {
        this.quan2 = quan2;
    }

    public String getQuanE() {
        return quanE;
    }

    public void setQuanE(String quanE) {
        this.quanE = quanE;
    }

    public String getMoral1() {
        return moral1;
    }

    public void setMoral1(String moral1) {
        this.moral1 = moral1;
    }

    public String getMoral2() {
        return moral2;
    }

    public void setMoral2(String moral2) {
        this.moral2 = moral2;
    }

    public String getMoralE() {
        return moralE;
    }

    public void setMoralE(String moralE) {
        this.moralE = moralE;
    }
}

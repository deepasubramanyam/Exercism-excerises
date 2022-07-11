class RnaTranscription {

    String transcribe(String dnaStrand) {

        String temp="";
        for (int i = 0; i < dnaStrand.length(); i++) {
            if(dnaStrand.charAt(i)=='G')
            {
                temp+="C";
            }
            else if(dnaStrand.charAt(i)=='C')
            {
                temp+="G";
            }
            else if(dnaStrand.charAt(i)=='T')
            {
                temp+="A";
            }
            else if(dnaStrand.charAt(i)=='A')
            {
                temp+="U";
            }
            else
            {
                temp+=dnaStrand.charAt(i);
            }
    }
        return temp;

}
}

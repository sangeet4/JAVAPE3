package pe3;

public class VowelRemover {
    private String country;

    public VowelRemover() {}

    public void setCountry(String country){
        this.country = country;
    }

    public String getCountry(){
        return this.country;
    }

    public void removeVowelOfCountry(){
        StringBuffer newCountry = new StringBuffer("");
        for(int i=0; i<this.country.length(); i++) {
            switch (this.country.charAt(i)) {
                case 'a':
                    continue;
                case 'e':
                    continue;
                case 'i':
                    continue;
                case 'o':
                    continue;
                case 'u':
                    continue;
                default:
                    newCountry.append(country.charAt(i));
            }
        }
        this.country = new String(newCountry);
    }
}

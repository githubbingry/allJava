package coba;

//opRecBEMText.java
class Identitas{
    private final String nama = "Fachry Ghifary";
    private final String prodi = "Teknik Informatika";
    private final int angkatan = 2023;
    private final String quotesFav = "\"It's not what happen to you, but how you react to it that matters\" - Epictetus";
    private final String alasanMasuk = "untuk meningkatkan skill ngoding saya dan belajar dari para sepuh🙏";
    
    Identitas(){}

    public String getNama(){ return nama; }
    public String getProdi(){ return prodi; }
    public int getAngkatan(){ return angkatan; }
    public String getQuotes(){ return quotesFav; }
    public String getAlasan(){ return alasanMasuk; }
}

public class opRecBEMText {
    public static void main(String[] args) {
        Identitas f = new Identitas();
        System.out.printf("""
            [OPEN RECRUITMENT STAFF BEM KM FASILKOM UNSRI 2024]

            %s
            
            Halo Ilkomers! Saya %s dari %s Angkatan %d, siap mengikuti Open Recruitment dan menjadi bagian dari BEM KM Fasilkom Unsri 2024🤗
                
            Saya mengikuti Kepengurusan BEM KM Fasilkom Unsri periode 2024 dikarenakan %s.
                
            Do your best at every opportunity that you have✨
                
            inspired by fazri
            arief
            andhika
            daffa
            jusei
                
            #OprecBEMKMFasilkomUnsri2024
            #ColaborationOfIdeaRegeneration"""
        ,f.getQuotes(), f.getNama(), f.getProdi(), f.getAngkatan(), f.getAlasan());
    }
}


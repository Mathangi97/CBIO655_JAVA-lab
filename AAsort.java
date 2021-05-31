import java.util.Arrays;
class AAsort
{
 public static void main(String args[])
 {
  String [] aminoacid={"Tyrosine","Arginine","Serine","Asparagine","Phenylalanine","Cysteine",
                        "Glutamine","Valine","Glutamic acid","Alanine","Glycine","Histidine","Isoleucine",
                        "Leucine","Lysine","Methionine","Proline","Aspartic acid",
                        "Threonine","Tryptophan"};
  System.out.println("Array before sorting: "+Arrays.toString(aminoacid));
  
  Arrays.sort(aminoacid);
  System.out.print("Array after sorting: "+Arrays.toString(aminoacid));
 }
}

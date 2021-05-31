class Amino
{
 public static void main(String args[])
 {
  String [] aminoacid={"Alanine","Arginine","Asparagine","Aspartic acid","Cysteine",
                        "Glutamine","Glutamic acid","Glycine","Histidine","Isoleucine",
                        "Leucine","Lysine","Methionine","Phenylalanine","Proline",
                        "Serine","Threonine","Tryptophan","Tyrosine","Valine"};
  int [] molweight={89,174,132,133,121,
                    146,147,75,155,131,
                    131,146,149,165,115,
                    105,119,204,181,117};
  
  System.out.println("Amino acid"+" - "+"Molecular weight");
  for(int i=0;i<aminoacid.length;i++)
  {
   System.out.println(aminoacid[i]+" - "+molweight[i]+"Da");
  }
 }
}
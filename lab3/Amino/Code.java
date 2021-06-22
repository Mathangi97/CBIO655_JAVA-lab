package Amino;
public class Code
{
 String aminoacid [] = {"Alanine","Lysine","Isoleucine","Cysteine","Proline"};
 String code [] = {"ALA","LYS","ILE","CYS","PRO"};
  
 public void print()
 {
  for(int i=0; i<aminoacid.length; i++)
  {
   System.out.println("Amino acid : "+aminoacid[i]+ " - "+code[i]);
  }
 }
}
 
  


  
  
public class Mol_weight {
    public static void main(String args[])
    {
       String[] amino_acid={"Alanine","Arginine","Asparagine","Aspartate","Cysteine","Glutamate","Glutamine","Glycine","Histidine","Isoleucine","Leucine","Lysine","Methionine","Phenylalanine","Proline","Serine","Threonine","Tryptophan","Tyrosine","Valine"};
       double[] weight={89.1,174.2,132.1,133.1,121.2,147.1,146.2,75.1,155.2,131.2,131.2,146.2,149.2,165.2,115.2,105.1,119.1,204.2,181.2,117.1};
        System.out.println("Amino acids"+" "+"and"+" "+"weights");
       for(int i=0;i<20;i++)
       {
           System.out.println(amino_acid[i]+"="+weight[i]);
           
       }
} 
        
      
    }
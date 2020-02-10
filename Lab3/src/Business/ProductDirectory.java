/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author 张睿哲
 */
public class ProductDirectory {
    private ArrayList<ProductInfo> prodDirectory;
    
    public ProductDirectory()
    {
        this.prodDirectory=new ArrayList<ProductInfo>();
    }

    public ArrayList<ProductInfo> getProdDirectory() {
        return prodDirectory;
    }

    public void setProdDirectory(ArrayList<ProductInfo> prodDirectory) {
        this.prodDirectory = prodDirectory;
    }
    
    public ProductDirectory searchByProdName(String name)
    {
        ProductDirectory dir=new ProductDirectory();
        for(ProductInfo i:this.prodDirectory)
        {
            if(i.getProdName().equals(name))
                dir.getProdDirectory().add(i);
        }
        return dir;
    }
    public void delete(ProductInfo info)
    {
        this.prodDirectory.remove(info);
    }
    
}

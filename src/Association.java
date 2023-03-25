
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author silvi
 * @param <K>
 * @param <V>
 */
public class Association<K,V>
{
   
    protected K theKey; 
   
   
    protected V theValue; 

  
    /**
 
     * @pre 
     * @post 
     * @param key 
     * @param value 
     */
    public Association(K key, V value)
    {
        theKey = key;
        theValue = value;
    }


    /**
     * @post 
     * @return 
     * @see
     */
    @Override
    public int hashCode()
    {
        return getKey().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Association<?, ?> other = (Association<?, ?>) obj;
        if (!Objects.equals(this.theKey, other.theKey)) {
            return false;
        }
        return Objects.equals(this.theValue, other.theValue);
    }
    
    /**
     * @post 
     * @return 
     */
    public V getValue()
    {
        return theValue;
    }

    /**
     * @post 
     * @return 
     */
    public K getKey()
    {
        return theKey;
    }

    /**
     * @post 
     * @param value 
     */
    public void setValue(V value)
    {
        theValue = value;  
    }

    
    public void setKey(K Key)
    {
        theKey = Key;  
    }
}


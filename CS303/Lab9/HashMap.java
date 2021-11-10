package CS303.Lab9;

public class HashMap 
{
   private final static int TABLE_SIZE = 100;

   HashEntry[] table;

   HashMap() 
   {
      table = new HashEntry[TABLE_SIZE];
   }

   public String get(double key) 
   {
      String value = "";
      int index = (int) (key % TABLE_SIZE);
      if(table[index].getKey() == key)
      {
         value = table[index].getValue();
      }

      int originalIndex = index;
      while(table[index].getKey() != key)
      {
         index = (7 * index + 1) % TABLE_SIZE;
         if(index == originalIndex)
         {
            return "Key not in file or was replaced by another key";
         }
      }

      value = table[index].getValue();
      
      return value;
   }

   public void put(double key, String value) 
   {
      int index = (int) (key % TABLE_SIZE);
      //System.out.println("Index: " + index);

      if(table[index] == null)
      {
         table[index] = new HashEntry(key, value);
      }
      else
      {
         int originalIndex = index;
         while(table[index] != null)
         {
            index = (7 * index + 1) % TABLE_SIZE;
            if(index == originalIndex)
            {
               break;
            }
         }
         table[index] = new HashEntry(key, value);
      }
   }

   public void linearProbe(double key, String value)
   {
      int index = (int) ((key) % TABLE_SIZE);

      for(int i = 1; i < table.length; i++)
      {
         if(table[index] != null)
         {
            index = (int) ((key + i) % TABLE_SIZE);
         }
         else
         {
            table[index] = new HashEntry(key, value);
            break;
         }
      }
   }

   public void quadraticProbe(double key, String value)
   {
      int index = (int) ((key) % TABLE_SIZE);

      for(int i = 1; i < table.length; i++)
      {
         if(table[index] != null)
         {
            index = (int) ((key + Math.pow(i,2)) % TABLE_SIZE);
         }
         else
         {
            table[index] = new HashEntry(key, value);
            break;
         }
      }
   }

}

package CS303.Lab9;

public class HashMap2 
{
   private final static int TABLE_1 = 1000;
   private final static int TABLE_2 = 2000;
   private final static int TABLE_3 = 4000;
   private final static int TABLE_4 = 8000;
   private final static int TABLE_5 = 16000;

   HashEntry[] table;
   HashEntry[] table2;
   HashEntry[] table3;
   HashEntry[] table4;
   HashEntry[] table5;



   HashMap2()
   {
      table = new HashEntry[TABLE_1]; 
      table2 = new HashEntry[TABLE_2];
      table3 = new HashEntry[TABLE_3];
      table4 = new HashEntry[TABLE_4];
      table5 = new HashEntry[TABLE_5];

   }

   public String get(double key, int choice) 
   {
      String value = "";
      switch(choice)
      {
         case 1:

         int index = (int) (key % TABLE_1);
         if(table[index] != null)
         {
            if (table[index].getKey() == key) 
            {
               value = table[index].getValue();
            }

            int originalIndex = index;
            while (table[index] != null && table[index].getKey() != key) 
            {
               index = (7 * index + 1) % TABLE_1;
               if (index == originalIndex) 
               {
                  return "Key not in file or was replaced by another key";
               }
            }

            if(table[index] != null)
            {
                System.out.println("Value: " + table[index].getValue());
                value = table[index].getValue();
            }
            else
            {
                value = null;
            }
         }
         
         break;

         case 2:
         index = (int) (key % TABLE_2);
         if(table2[index] != null)
         {
            if (table2[index].getKey() == key) 
            {
               value = table2[index].getValue();
            }

            int originalIndex = index;
            while (table2[index] != null && table2[index].getKey() != key) 
            {
               index = (7 * index + 1) % TABLE_2;
               if (index == originalIndex) 
               {
                  return "Key not in file or was replaced by another key";
               }
            }

            if(table2[index] != null)
            {
               //System.out.println("Value: " + table2[index].getValue());
               value = table2[index].getValue();
            }
            else
            {
               value = null;
            }
         }
         break;

         case 3:
         index = (int) (key % TABLE_3);
         if(table3[index].getKey() == key)
         {
            value = table3[index].getValue();
         }
   
         int originalIndex = index;
         while(table3[index].getKey() != key)
         {
            index = (7 * index + 1) % TABLE_3;
            if(index == originalIndex)
            {
               return "Key not in file or was replaced by another key";
            }
         }
   
         value = table3[index].getValue();
         break;

         case 4:
         index = (int) (key % TABLE_4);
         if(table4[index].getKey() == key)
         {
            value = table4[index].getValue();
         }
   
         originalIndex = index;
         while(table4[index].getKey() != key)
         {
            index = (7 * index + 1) % TABLE_4;
            if(index == originalIndex)
            {
               return "Key not in file or was replaced by another key";
            }
         }
   
         value = table4[index].getValue();
         break;

         case 5:
         index = (int) (key % TABLE_5);
         if(table5[index].getKey() == key)
         {
            value = table5[index].getValue();
         }
   
         originalIndex = index;
         while(table5[index].getKey() != key)
         {
            index = (7 * index + 1) % TABLE_5;
            if(index == originalIndex)
            {
               return "Key not in file or was replaced by another key";
            }
         }
   
         value = table5[index].getValue();
         break;
      }
      
      return value;
   }

   public void put(double key, String value, int choice) 
   {
      switch(choice)
      {
         case 1:
         int index = (int) (key % TABLE_1);

         if (table[index] == null) 
         {
            table[index] = new HashEntry(key, value);
         } 
         else 
         {
            int originalIndex = index;
            while (table[index] != null) 
            {
               index = (7 * index + 1) % TABLE_1;
               if (index == originalIndex) 
               {
                  break;
               }
            }
            table[index] = new HashEntry(key, value);
         }
         break;

         case 2:
         index = (int) (key % TABLE_2);

         if (table2[index] == null) 
         {
            table2[index] = new HashEntry(key, value);
         } 
         else 
         {
            int originalIndex = index;
            while (table2[index] != null) 
            {
               index = (7 * index + 1) % TABLE_2;
               if (index == originalIndex) 
               {
                  break;
               }
            }
            table2[index] = new HashEntry(key, value);
         }
         break;

         case 3:
         index = (int) (key % TABLE_3);

         if (table3[index] == null) 
         {
            table3[index] = new HashEntry(key, value);
         } 
         else 
         {
            int originalIndex = index;
            while (table3[index] != null) 
            {
               index = (7 * index + 1) % TABLE_3;
               if (index == originalIndex) 
               {
                  break;
               }
            }
            table3[index] = new HashEntry(key, value);
         }
         break;

         case 4:
         index = (int) (key % TABLE_4);

         if (table4[index] == null) 
         {
            table4[index] = new HashEntry(key, value);
         } 
         else 
         {
            int originalIndex = index;
            while (table4[index] != null) 
            {
               index = (7 * index + 1) % TABLE_4;
               if (index == originalIndex) 
               {
                  break;
               }
            }
            table4[index] = new HashEntry(key, value);
         }
         break;

         case 5:
         index = (int) (key % TABLE_5);

         if (table5[index] == null) 
         {
            table5[index] = new HashEntry(key, value);
         } 
         else 
         {
            int originalIndex = index;
            while (table5[index] != null) 
            {
               index = (7 * index + 1) % TABLE_5;
               if (index == originalIndex) 
               {
                  break;
               }
            }
            table5[index] = new HashEntry(key, value);
         }
         break;
      }
   }

   public void linearProbe(double key, String value, int choice)
   {
      switch(choice)
      {
         case 1:
         int index = (int) ((key) % TABLE_1);
         for (int i = 1; i < table.length; i++) 
         {
            if (table[index] == null)
            {
               table[index] = new HashEntry(key, value);
            } 
            else 
            {
               int originalIndex = index;
               while (table[index] != null) 
               {
                  index = (int) ((key + i) % TABLE_1);
                  if (index == originalIndex) 
                  {
                     break;
                  }
               }
               table[index] = new HashEntry(key, value);
               break;
            }
         }
         break;

         case 2:
         index = (int) ((key) % TABLE_2);
         for (int i = 1; i < table2.length; i++) 
         {
            if (table2[index] == null)
            {
               table2[index] = new HashEntry(key, value);
            } 
            else 
            {
               int originalIndex = index;
               while (table2[index] != null) 
               {
                  index = (int) ((key + i) % TABLE_2);
                  if (index == originalIndex) 
                  {
                     break;
                  }
               }
               table2[index] = new HashEntry(key, value);
               break;
            }
         }
         break;

         case 3:
         index = (int) ((key) % TABLE_3);
         for (int i = 1; i < table3.length; i++) 
         {
            if (table3[index] == null)
            {
               table3[index] = new HashEntry(key, value);
            } 
            else 
            {
               int originalIndex = index;
               while (table3[index] != null) 
               {
                  index = (int) ((key + i) % TABLE_3);
                  if (index == originalIndex) 
                  {
                     break;
                  }
               }
               table3[index] = new HashEntry(key, value);
               break;
            }
         }
         break;

         case 4:
         index = (int) ((key) % TABLE_4);
         for (int i = 1; i < table4.length; i++) 
         {
            if (table4[index] == null)
            {
               table4[index] = new HashEntry(key, value);
            } 
            else 
            {
               int originalIndex = index;
               while (table4[index] != null) 
               {
                  index = (int) ((key + i) % TABLE_4);
                  if (index == originalIndex) 
                  {
                     break;
                  }
               }
               table4[index] = new HashEntry(key, value);
               break;
            }
         }
         break;

         case 5:
         index = (int) ((key) % TABLE_5);
         for (int i = 1; i < table5.length; i++) 
         {
            if (table5[index] == null)
            {
               table5[index] = new HashEntry(key, value);
            } 
            else 
            {
               int originalIndex = index;
               while (table5[index] != null) 
               {
                  index = (int) ((key + i) % TABLE_5);
                  if (index == originalIndex) 
                  {
                     break;
                  }
               }
               table5[index] = new HashEntry(key, value);
               break;
            }
         }
         break;
      }
   }

   public void quadraticProbe(double key, String value, int choice)
   {
      switch(choice)
      {
         case 1:
         int index = (int) ((key) % TABLE_1);
         for (int i = 1; i < table.length; i++) 
         {
            if (table[index] == null)
            {
               table[index] = new HashEntry(key, value);
            } 
            else 
            {
               int originalIndex = index;
               while (table[index] != null) 
               {
                  index = (int) ((key + Math.pow(i, 2)) % TABLE_1);
                  if (index == originalIndex) 
                  {
                     break;
                  }
               }
               table[index] = new HashEntry(key, value);
               break;
            }
         }
         break;

         case 2:
         index = (int) ((key) % TABLE_2);
         for (int i = 1; i < table2.length; i++) 
         {
            if (table2[index] == null)
            {
               table2[index] = new HashEntry(key, value);
            } 
            else 
            {
               int originalIndex = index;
               while (table2[index] != null) 
               {
                  index = (int) ((key + Math.pow(i, 2)) % TABLE_2);
                  if (index == originalIndex) 
                  {
                     break;
                  }
               }
               table2[index] = new HashEntry(key, value);
               break;
            }
         }
         break;

         case 3:
         index = (int) ((key) % TABLE_3);
         for (int i = 1; i < table3.length; i++) 
         {
            if (table3[index] == null)
            {
               table3[index] = new HashEntry(key, value);
            } 
            else 
            {
               int originalIndex = index;
               while (table3[index] != null) 
               {
                  index = (int) ((key + Math.pow(i, 2)) % TABLE_3);
                  if (index == originalIndex) 
                  {
                     break;
                  }
               }
               table3[index] = new HashEntry(key, value);
               break;
            }
         }
         break;

         case 4:
         index = (int) ((key) % TABLE_4);
         for (int i = 1; i < table4.length; i++) 
         {
            if (table4[index] == null)
            {
               table4[index] = new HashEntry(key, value);
            } 
            else 
            {
               int originalIndex = index;
               while (table4[index] != null) 
               {
                  index = (int) ((key + Math.pow(i, 2)) % TABLE_4);
                  if (index == originalIndex) 
                  {
                     break;
                  }
               }
               table4[index] = new HashEntry(key, value);
               break;
            }
         }
         break;

         case 5:
         index = (int) ((key) % TABLE_5);
         for (int i = 1; i < table5.length; i++) 
         {
            if (table5[index] == null)
            {
               table5[index] = new HashEntry(key, value);
            } 
            else 
            {
               int originalIndex = index;
               while (table5[index] != null) 
               {
                  index = (int) ((key + Math.pow(i, 2)) % TABLE_5);
                  if (index == originalIndex) 
                  {
                     break;
                  }
               }
               table5[index] = new HashEntry(key, value);
               break;
            }
         }
         break;
      }
   }
}
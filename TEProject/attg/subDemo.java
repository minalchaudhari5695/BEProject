/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package attg;

/**
 *
 * @author Minal
 */

import java.awt.Dimension;
import java.sql.*;
import javax.swing.*;
import java.util.*;
class subDemo extends JFrame
{
         String col[]={"subject_name","subject_type","no._of_lecture","no._of_practicle"};
                   Object data[][]=null;
subDemo()
{
    setTitle("SUBJECT INFORMATION");
    setVisible(true);
data=new Object[14][];
                   for(int m=0;m<data.length;m++)
                   {
                       data[m]=new Object[4];
                   }
     
            JTable table=new JTable(data,col);   
                   
      try{
         Class.forName("com.mysql.jdbc.Driver");
        java.sql.Connection myConnection1=(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable","minal","system");
           Statement st=myConnection1.createStatement();
            ResultSet rs = null;
          /// String c1=(String) jComboBox16.getSelectedItem();
            //String c1=s1;
            // if(c1.equalsIgnoreCase("te-a"))
                   rs=st.executeQuery("select * from sub_manager");
            //else if(c1.equalsIgnoreCase("te-b"))
               //   rs=st.executeQuery("select * from te_b");
                   int i=0,j=0;
           while(rs.next()){
               j=0;
               data[i][j]=rs.getString(1);
               data[i][++j]=rs.getString(2);
               data[i][++j]=rs.getInt(3);
               data[i][++j]=rs.getInt(4);
               i++;
           }
                  table.setEnabled(false);
                 JScrollPane scrollPane = new JScrollPane(table);
            add(scrollPane);
            validate();
            pack();
        //  setResizable(false);
//setSize(900,400);
           myConnection1.close();
     // setResizable(false);     
      }
        catch(Exception e){}
  }
  }/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

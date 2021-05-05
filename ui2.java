<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/LinearLayout1"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:showDividers="middle"
    android:dividerPadding="10dp"
    tools:context="com.example.jameshuang.demo1.MainActivity"
    android:weightSum="1">
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent" >
     <RadioGroup
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:layout_alignParentTop="true"
            android:layout_alignParentLeft="true"
            android:layout_alignParentStart="true">
            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"></LinearLayout>
            <RadioButton android:id="@+id/rbtn_gps_to"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Private car"/>

            <RadioButton android:id="@+id/rbtn_gps_from"
                android:layout_width="185dp"
                android:layout_height="wrap_content"
                android:text="Company car"/>



                

        </RadioGroup>
    <TextView
        android:id="@+id/text_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignBaseline="@+id/Edittext"
        android:layout_alignBottom="@+id/Edittext"
        android:layout_alignParentLeft="true"
        android:text="Name:" />

    <EditText
        android:id="@+id/Edittext"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentRight="true"
        android:layout_alignParentTop="true"
        android:layout_marginTop="106dp"
        android:ems="10"
        android:hint="Input your name" >
         <requestFocus />
    </EditText>

     <TextView
        android:id="@+id/text_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignBaseline="@+id/Edittext"
        android:layout_alignBottom="@+id/Edittext"
        android:layout_alignParentLeft="true"
        android:layout_alignParentLeft="true"
        android:text="Phone:" />

    <EditText
        android:id="@+id/Edittext"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentRight="true"
        android:layout_alignParentTop="true"
        android:layout_marginTop="106dp"
        android:ems="10"
        android:hint="Input your phone number" >
         <requestFocus />

     <TextView
        android:id="@+id/text_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignBaseline="@+id/Edittext"
        android:layout_alignBottom="@+id/Edittext"
        android:layout_alignParentLeft="true"
        android:text="ID:" />

    <EditText
        android:id="@+id/Edittext"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentRight="true"
        android:layout_alignParentTop="true"
        android:layout_marginTop="106dp"
        android:ems="10"
        android:hint="Input your ID number" >
         <requestFocus />
    </EditText>













</RelativeLayout>
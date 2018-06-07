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
        android:layout_width="wrap_content"
        android:layout_height="wrap_content">

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
    </RelativeLayout>

<TextView
    android:layout_width="73dp"
    android:layout_height="wrap_content"
    android:textSize="@dimen/activity_horizontal_margin"
    android:text="Name:" />


    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Phone" />

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="ID"

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="0dip"
        android:layout_weight="1"
        android:gravity="center|bottom"
        android:orientation="vertical" >

        <Button
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_gravity="center_horizontal|center"
            android:text="Add user "
            android:id="@+id/button2" />


    </LinearLayout>


</LinearLayout>
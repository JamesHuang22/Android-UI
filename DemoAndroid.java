<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:weightSum="1">


    <RadioGroup
        android:id="@+id/radiogroup"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_alignParentTop="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true">
        <RadioButton android:id="@+id/rbtn_gps_to"
            android:layout_width="wrap_content"
            android:layout_weight="1"
            android:layout_height="wrap_content"
            android:text="Private car"/>

        <RadioButton android:id="@+id/rbtn_gps_from"
            android:layout_width="185dp"
            android:layout_height="wrap_content"
            android:layout_weight="0"
            android:text="Company car"/>

    </RadioGroup>

    <Button
        android:text="Add User"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/button"
        android:layout_alignParentBottom="true"
        android:layout_alignParentRight="true"
        android:layout_alignParentEnd="true" />

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:id="@+id/linearLayout"
        android:layout_below="@+id/radiogroup"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true">
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"

            >
            <TextView
                android:text="Name"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:id="@+id/textView5"

                />

            <EditText
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:hint="input name"
                android:layout_marginLeft="64dp"
                android:background="@null"/>
        </LinearLayout>
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"

            android:weightSum="1">

            <TextView
                android:text="Phone"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:background="@null"

                />

            <EditText
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:hint="input phone"
                android:layout_marginLeft="63dp"
                android:background="@null"
                android:id="@+id/et_phone_Number"/>

            <Button
                android:text="Call the number                       "
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:id="@+id/button2"
                android:layout_alignBottom="@+id/linearLayout"
                android:layout_alignParentRight="true"
                android:layout_alignParentEnd="true"
                android:layout_marginRight="100dp"
                android:layout_marginEnd="100dp"
                android:layout_weight="0.14" />
        </LinearLayout>
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"

            >

            <TextView
                android:text="ID"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:id="@+id/textView"

                />

            <EditText
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:hint="input ID"
                android:layout_marginLeft="89dp"
                android:background="@null"/>
        </LinearLayout>

    </LinearLayout>


</RelativeLayout>
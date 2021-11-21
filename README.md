# Android_Bottom_Navigation
Instagram's Bottom Navigation Clone 

# Code

### menu/menu_item.xml
```
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">

    <item
        android:id="@+id/homeIcon"
        android:icon="@drawable/home"
        android:title="Home"/>

    <item
        android:id="@+id/searchIcon"
        android:title="Search"
        android:icon="@drawable/search" />

    <item
        android:id="@+id/addIcon"
        android:title="Add"
        android:icon="@drawable/add" />

    <item
        android:id="@+id/favIcon"
        android:title="Activity"
        android:icon="@drawable/fav" />

    <item
        android:id="@+id/profileIcon"
        android:title="Profile"
        android:icon="@drawable/person" />


</menu>
```

### activity_main.xml
```
 <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottomNavigation"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.5"
        app:layout_constraintStart_toStartOf="parent"

        app:menu="@menu/menu_item"
        />
```

#### MainActivity.java
```
BottomNavigationView bottomNavigationView;

bottomNavigationView = findViewById(R.id.bottomNavigation);

      bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.homeIcon:
                        Toast toast = Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT);
                        toast.setGravity(Gravity.CENTER, 0,0);
                        toast.show();
                        break;

                    case R.id.searchIcon:
                        Toast toast1 = Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT);
                        toast1.setGravity(Gravity.CENTER, 0,0);
                        toast1.show();
                        break;

                    case R.id.addIcon:
                        Toast toast2 = Toast.makeText(MainActivity.this, "Add", Toast.LENGTH_SHORT);
                        toast2.setGravity(Gravity.CENTER, 0,0);
                        toast2.show();                        break;

                    case R.id.favIcon:
                        Toast toast3 = Toast.makeText(MainActivity.this, "Activity", Toast.LENGTH_SHORT);
                        toast3.setGravity(Gravity.CENTER, 0,0);
                        toast3.show();
                        break;

                    case R.id.profileIcon:
                        Toast toast4 = Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT);
                        toast4.setGravity(Gravity.CENTER, 0,0);
                        toast4.show();
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + item.getItemId());
                }
                return true;
            }
        });
```

# App Highlight

<img src="app_images/Bottom Nav Code.png" width="1000" /><br>

<img src="app_images/Bottom Nav App1.png" width="300" /><br>

<img src="app_images/Bottom Nav App2.png" width="300" /><br>

<img src="app_images/Bottom Nav App3.png" width="300" /><br>

<img src="app_images/Bottom Nav App4.png" width="300" /><br>

<img src="app_images/Bottom Nav App5.png" width="300" /><br>

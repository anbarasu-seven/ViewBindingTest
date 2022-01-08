# Using ViewBinding in your Android app

We can get rid of using findViewById()

# How to enable?
add this line to your module level build.gradle file
android {
    ...
        buildFeatures {
        viewBinding = true
    }
}

# If you want a layout file to be ignored while generating binding classes
add this line to the root of the layout, so that view binding will not be applied 
to layout.

<LinearLayout
    ...
    tools:viewBindingIgnore="true" >
    ...
</LinearLayout>

# How to get view reference without using findViewById()?
Take following example
<LinearLayout ... >
    <TextView android:id="@+id/first_name" />
    <TextView android:id="@+id/last_name" />
    <TextView android:id="@+id/address_line" />
</LinearLayout>

layout file name    | binding name
activity_main       ActivityMainBinding  

so instead of using 
setContentView(R.layout.activity_main)

use
binding = ActivityMainBinding.inflate(layoutInflater)
setContentView(binding?.root)
binding is the binding module created for the layout file activity_main.xml
binding.root is the super most parent container in the layout file, 
in our case it is LinearLayout

# How to update view
binding?.firstName?.text = "Survivors code"
binding?.lastName?.text = "Youtube "
binding?.addressLine?.text = "Channel"



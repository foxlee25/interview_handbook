# Imports the monkeyrunner modules used by this program
from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice

# Connects to the current device, returning a MonkeyDevice object
device = MonkeyRunner.waitForConnection()

# Installs the Android package. Notice that this method returns a boolean, so you can test
# to see if the installation worked.
device.installPackage('E:\\Android\\Git\\Code_v2\\LolInfoMobile_struct\\app\\build\\outputs\\apk\\app-debug.apk')

# sets a variable with the package's internal name
package = 'com.fox_lee.yunwen.lolinfomobile_struct'

# sets a variable with the name of an Activity in the package
activity = 'com.fox_lee.yunwen.lolinfomobile_struct.MainActivity'

# sets the name of the component to start
runComponent = package + '/' + activity

# Runs the component
device.startActivity(component=runComponent)

#We need to sleep here, to make sure we will get correct screenshot.
MonkeyRunner.sleep(5)

# Presses the Menu button
device.press('KEYCODE_MENU', MonkeyDevice.DOWN_AND_UP)

# Takes a screenshot
result = device.takeSnapshot()

# Writes the screenshot to a file
result.writeToFile('C:\\Users\\Yunwen\\Desktop\\shot1.png','png')
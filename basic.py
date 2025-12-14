import pyautogui
import time

# Define the two points (x, y) on the screen
point1 = (30, 30) # Replace with your coordinates
point2 = (50, 50) # Replace with your coordinates

# Set delay between movements/clicks (in seconds)
delay = 4

try:
    while True:
        # Move to first point and click
        pyautogui.moveTo(point1[0], point1[1], duration=0.5)
        pyautogui.click()
        print(f"Clicked at {point1}")
        time.sleep(delay)

        # Move to second point and click
        pyautogui.moveTo(point2[0], point2[1], duration=0.5)
        pyautogui.click()
        print(f"Clicked at {point2}")
        time.sleep(delay)

except KeyboardInterrupt:
    print("\nStopped by user.")

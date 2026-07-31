import time

# 2. Get user input
seconds = input("Enter countdown time in seconds: ")

# 3. Convert input to integer
seconds = int(seconds)

# 4. Define countdown function
def countdown(t):
    
    # 5. While loop until t reaches 0
    while t > 0:
        
        # 6. Convert seconds to minutes and seconds
        mins, secs = divmod(t, 60)
        
        # Format time as MM:SS
        timer = '{:02d}:{:02d}'.format(mins, secs)
        
        # Print on same line
        print(timer, end='\r')
        
        # Wait 1 second
        time.sleep(1)
        
        # Decrease time
        t -= 1

    # 7. Final message
    print("Time's up!")

# Run the countdown
countdown(seconds)
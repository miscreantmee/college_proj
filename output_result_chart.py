import json
import matplotlib.pyplot as plt

# Step 1: Read Data from JSON File
with open('analysis_results.json', 'r') as json_file:
    data = json.load(json_file)

# Step 2: Prepare Data for Plotting
timestamps = data['timestamps']
engagement_scores = data['engagement_scores']

# Step 3: Create the Chart
plt.figure(figsize=(10, 6))  # Set the figure size

# Create a line chart
plt.plot(timestamps, engagement_scores, label='Engagement Scores')
plt.xlabel('Time')
plt.ylabel('Engagement Score')
plt.title('Engagement Over Time')
plt.legend()
plt.grid(True)

# Uncomment the following line to save the chart as an image (optional)
plt.savefig('engagement_chart.png')

# Step 4: Display the Chart or Save it as an Image (Choose one option)
plt.show()  # Display the chart

# Print a message indicating that the chart has been displayed or saved
print("Chart displayed or saved.")

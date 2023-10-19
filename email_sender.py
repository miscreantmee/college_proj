import os  # Import the os module
import smtplib
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
from email.mime.base import MIMEBase
from email import encoders
from flask import Flask, request, render_template, send_from_directory

app = Flask(__name__)

# Configure the static folder to serve images
static_folder_path = os.path.join(os.getcwd(), 'templates', 'assets', 'img')
app.static_folder = static_folder_path


@app.route('/')
def index():
    return render_template('Email_Feedback.html')

@app.route('/send_email', methods=['POST'])
def send_email():
    if request.method == 'POST':
        # Replace with a list of recipient email addresses
        recipient_emails = ['kashyapprabhat254@gmail.com']
        
        sender_email = 'rishichabbra149@gmail.com'  # Replace with your Gmail address
        sender_password = 'nlpy qmbm eode cfrl'  # Use your App Password here

        subject = 'Hello from Student Engagement Detection in E-learning  Environments!'
        message = """Warning!,Pay Attention Use a Timer:
Practice the Pomodoro Technique—work for 25 minutes, then take a 5-minute break. Repeat this cycle to maintain focus and productivity.

Stay Organized:
Use planners or apps to organize your tasks and schedule. Having a structured plan helps reduce anxiety and keeps you on track.

Prioritize Tasks:
Start with the most challenging tasks when your energy and focus are high. As you complete tasks, you'll gain momentum.

Stay Hydrated and Eat Well:
Drink enough water and maintain a balanced diet. Dehydration and hunger can affect concentration."""

        try:
            # Create a multipart message
            msg = MIMEMultipart()
            msg['From'] = sender_email
            msg['Subject'] = subject

            # Attach the message body
            msg.attach(MIMEText(message, 'plain'))

            # Attach a media file (e.g., a PDF)
            file_path = 'engagement_chart.png'  # Replace with the actual file path
            attachment = open(file_path, 'rb')

            part = MIMEBase('application', 'octet-stream')
            part.set_payload(attachment.read())
            encoders.encode_base64(part)
            part.add_header('Content-Disposition', f'attachment; filename={file_path}')

            msg.attach(part)

            # Connect to Gmail's SMTP server
            server = smtplib.SMTP('smtp.gmail.com', 587)
            server.starttls()
            server.login(sender_email, sender_password)

            for recipient_email in recipient_emails:
                # Set the recipient for this iteration
                msg['To'] = recipient_email

                # Send the email to the current recipient
                server.sendmail(sender_email, recipient_email, msg.as_string())

            server.quit()

            return 'Email sent successfully!'
        except Exception as e:
            return f'Email could not be sent. Error: {str(e)}'

@app.route('/assets/img/<image_name>')
def serve_image(image_name):
    # Construct the path to the requested image
    image_path = os.path.join(app.static_folder, 'img', image_name)

    # Check if the image exists in the static folder
    if os.path.exists(image_path):
        return send_from_directory(app.static_folder, 'img/' + image_name)
    else:
        # Return a 404 error if the image doesn't exist
        return 'Image not found', 404


if __name__ == '__main__':
    app.run(debug=True)

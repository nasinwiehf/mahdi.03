<script>
document.getElementById("contact-form").addEventListener("submit", function(e) {
  e.preventDefault();

  const name = e.target.name.value;
  const email = e.target.email.value;
  const message = e.target.message.value;

  const telegramToken = "7459290432:AAGwvnfEF25INBNrOKbT-dOiiaYmlQRvcWw";
  const chatId = "7230121237";
  const text = 📥 فرم جدید:\n\n👤 نام: ${name}\n📧 ایمیل: ${email}\n💬 پیام: ${message};

  fetch(https://api.telegram.org/bot${7459290432:AAGwvnfEF25INBNrOKbT-dOiiaYmlQRvcWw}/sendMessage, {
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    body: JSON.stringify({
      chat_id: chatId,
      text: text
    })
  })
  .then(response => {
    if (response.ok) {
      alert("پیام با موفقیت ارسال شد!");
    } else {
      alert("خطا در ارسال پیام.");
    }
  });
});
</script>

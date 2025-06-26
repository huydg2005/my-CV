// Hiệu ứng hiện phần tử khi cuộn tới
const fadeIns = document.querySelectorAll('.fade-in');

const appearOptions = {
  threshold: 0.1,
  rootMargin: "0px 0px -50px 0px"
};

const appearOnScroll = new IntersectionObserver((entries, observer) => {
  entries.forEach(entry => {
    if (!entry.isIntersecting) return;
    entry.target.classList.add('appear');
    observer.unobserve(entry.target);
  });
}, appearOptions);

fadeIns.forEach(fader => {
  appearOnScroll.observe(fader);
});
window.addEventListener('scroll', () => {
  const home = document.getElementById('Home');
  if (window.scrollY > 100) {
    home.classList.add('intro-hidden');
  } else {
    home.classList.remove('intro-hidden');
  }
});
  const scrollTopBtn = document.querySelector('.scroll-to-top');

  window.addEventListener('scroll', () => {
    if (window.scrollY > 300) {
      scrollTopBtn.classList.add('show');
    } else {
      scrollTopBtn.classList.remove('show');
    }
  });

  document.addEventListener('DOMContentLoaded', function () {
    const elements = document.querySelectorAll('.fade-in, .fade-in-left, .fade-in-right');

    const observer = new IntersectionObserver((entries) => {
      entries.forEach(entry => {
        if (entry.isIntersecting) {
          entry.target.classList.add('appear');
        } else {
          entry.target.classList.remove('appear'); // Khi ra khỏi khung nhìn thì ẩn lại
        }
      });
    }, { threshold: 0.3 });

    elements.forEach(el => observer.observe(el));
  });



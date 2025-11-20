#!/bin/zsh

# всегда работаем из папки скрипта (из проекта)
cd "$(dirname "$0")"

echo "=== WAYMAN quick commit & push ==="
git status

echo
read "MSG?Введите сообщение для коммита: "

# если ничего не ввёл — выходим
if [ -z "$MSG" ]; then
  echo "Сообщение пустое. Отмена."
  exit 1
fi

git add .
git commit -m "$MSG"
git push

echo "Готово ✅"

import { toast as toaster } from "@radix-ui/react-toast"

export function toast(options: { title: string; description?: string }) {
  // Custom wrapper around radix toast or your own UI toast
  toaster(options)
}
